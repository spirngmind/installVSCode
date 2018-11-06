set n=0

:abc

set /a n+=1
echo %n%
if %n%==60 goto hh

goto abc

:hh
echo isexit

pause