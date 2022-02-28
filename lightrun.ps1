$ErrorActionPreference = "Stop" # like 'set -e'
$PSDefaultParameterValues = @{ '*:Encoding' = 'utf8' }

function Expand-ZIPFile($file, $destination)
{
    $files = (Get-ChildItem $file).FullName

    $shell = new-object -com shell.application

    $files | %{
        $zip = $shell.NameSpace($_)

        foreach ($item in $zip.items()) {
           $shell.Namespace($destination).copyhere($item)
        }
    }
}


# Windows (Powershell)
Write-Host "* Downloading agent.zip..." -fore blue
curl.exe -k -o agent.zip -L "https://app.lightrun.com:443/download/company/thallys/agent.zip?platform=windows"

Remove-Item -LiteralPath "$pwd\agent" -Force -Recurse -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path "$pwd\agent"
Expand-ZIPFile agent.zip "$pwd\agent"

Write-Host "* Replacing API key in agent config..." -fore blue
get-content agent\agent.config | %{$_ -replace "com.lightrun.secret=.*","com.lightrun.secret=$env:LIGHTRUN_KEY"} > new_config
type new_config > agent\agent.config
del new_config
Write-Host "* Successfully downloaded agent." -fore green
Write-Host "  You can now add the agent to your java application by changing the command line as such:." -fore green
Write-Host "    java -agentpath:$pwd\agent\lightrun_agent.dll RestOfTheArgumentsHere" -fore green
exit 0
