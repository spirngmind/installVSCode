java -jar E:\workspace\vscode\installVSCode\install.jar

echo judge

if exist E:\workspace\vscode\installVSCode\installed.txt (
	echo installed
) 

if exist E:\workspace\vscode\installVSCode\uninstalled.txt (
	echo not installed
)

