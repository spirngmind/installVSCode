:abc

if exist E:\workspace\vscode\test\1.txt (
	goto hh
) else (
	echo not exist
	goto abc
)


:hh
echo exist
pause