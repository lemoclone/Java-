javac command:
$JAVA_HOME/javac -d ./ src/chapter03/oom/ClassPermGenOOM.java -cp lib/cglib-2.2.jar

java command
$JAVA_HOME/java -XX:+TraceClassUnloading -XX:PermSize=10m -XX:MaxPermSize=10m -cp .:lib/* chapter03.oom.ClassPermGenOOM



