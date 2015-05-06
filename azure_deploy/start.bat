rem env
set "JAVA_HOME=d:\home\site\wwwroot\bin\jdk1.8.0"
set "CMD_LINE_ARGS=-Djava.net.preferIPv4Stack=true -Dserver.port=%HTTP_PLATFORM_PORT% -jar d:\home\site\wwwroot\springboot-azure-example.jar"
echo Using JAVA_HOME:       "%JAVA_HOME%"
echo Using CMD_LINE_ARGS:       "%CMD_LINE_ARGS%"

set "CMD=%JAVA_HOME%\bin\java.exe %CMD_LINE_ARGS%"
echo Using CMD:       "%CMD%"
%CMD%