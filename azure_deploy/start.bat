rem env
set "JAVA_HOME="%ProgramFiles%\Java\jdk1.8.0_25""
set "CMD_LINE_ARGS=-Djava.net.preferIPv4Stack=true -Dserver.port=%HTTP_PLATFORM_PORT% -jar d:\home\site\wwwroot\springboot-azure-example-deploy.jar"
set "CMD=%JAVA_HOME%\bin\java.exe %CMD_LINE_ARGS%"
echo Using JAVA_HOME:       "%JAVA_HOME%"
echo Using CMD_LINE_ARGS:       "%CMD_LINE_ARGS%"
echo Using CMD:       "%CMD%"
%CMD%