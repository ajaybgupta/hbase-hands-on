# HBase Hands On

### References
- HBase: The Definitive Guide
- HBase in Action
- HBase High Performance in Action
- [HBase Schema: HBase Con 2012](http://ianvarley.com/coding/HBaseSchema_HBaseCon2012.pdf)

### Installation
Standalone mode as specified in HBase: The Definitive Guide

### Pre Requisite
- Java 1.7+ to be installed
<br>
Check correct version of Java is installed usinf `java -version`
- Set JAVA_HOME
<br>
Current Terminal Session  
`export JAVA_HOME=/Library/Java/Home`  
To check whether JAVA_HOME is set  
`echo $JAVA_HOME`  <br><br>
Setting as system variable  
We are using ZSH Terminal so we need to add these lines at bottom of .zshrc file  
`
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home
export JAVA_HOME;
`  
If you were using terminal then we would need to add these lines at bottom of .bashrc file

### Table of Contents
- [Introduction](src/main/Introduction.md)
- [General Shell Command](src/main/GeneralShellCommand.md)
- [Data Definition Language](src/main/scala/ddl/DataDefinitonLanguage.md)
- [Data Manipulation Language](src/main/scala/dml/DataManipulationLanguage.md)