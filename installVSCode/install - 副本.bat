java -jar E:\workspace\vscode\installVSCode\install.jar

echo judge

:abc

if exist E:\workspace\vscode\installVSCode\installed.txt (
	goto hh
) 

if exist E:\workspace\vscode\installVSCode\uninstalled.txt (
	echo not installed
	exit
)

goto abc

:hh
echo installed
pause