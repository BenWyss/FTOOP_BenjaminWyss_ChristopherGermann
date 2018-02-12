
# Coding Standard für FTOOP
##### Ein Projekt von Chris und Ben

## Ordner Hierarchie
Wir verwenden die Hierarchie, welche von Gradle und Maven unterstützt wird:
(Directories are bold, files regular);

- <b>root</b>
    - <b>bin</b>
    - <b>src</b>
        -  <b>Main</b>
        -  <b>Unit Test</b>
    -  <b>lib</b>
    -  <b>docs</b>
    -  convention.md

Die Hierarchie von Main und Unit Test sind genau dieselben. Jedoch besitzt im Unit Test directory jedes Dokument den Postfix Test.

- <b>Main</b>
    - main.java
- <b>Unit Test</b>
    - mainTest.java
    

## Header Template für alle Java Files
Wir führen einen Standardheader für alle Java Files ein.

```java 

/**
 * [Name of the Program]
 *
 * [Description/task]
 * 
 * @author Benjamin Wyss & Christopher Germann
 * @version 1.00
 **/

````

## Namenskonventionen
Wir verwenden <b>nie</b> Spaces! Anstatt der Spaces verwenden wir “_”. 
Beispiel:
	schlecht: Unit Test
	gut	: Unit_Test

Wir machen dass, weil es sonst enorm mühsam ist auf die Dokumente im Terminal zuzugreifen. Wenn es viele Whitespaces gibt, dann muss man im Terminal die Wörter ständig in Anführungszeichen schreiben.

## Kommentierung
Wir kommentieren mit JavaDocs. Jede Methode soll beschrieben werden und die Parameter sollen nachvollziehbar sein. Dazu verwenden wir diese JavaDoc Tags:
- @param	(Beschreibt Methodenparameter)
- @return	(Beschreibt return value einer Methode)
- @value	(Gibt den Wert eines konstanten Feldes 
- @exception	(Beschreibung einer Exception)
- @throws	(beschreibung des throws)


## Testing
Unser Testing Standard ist JUnit 4. Wir wollen die Applikationen im Stil des Test Driven Developments (TDD) entwickeln. Es ist also essentiell zuerst die Tests zu schreiben um zu wissen, was man will. Danach wird die Applikation nach dem Testentwurf entwickelt.
Ein Test ist vollständig wenn er diese Elemente enthält:
- Positive Tests
- Negative Test
- Jede Methode in der klasse hat Test



## Branching

## ReadMe#

Das Readme file wird immer im Format README.md gespeichert. 
Dank der md Endung können wir mit Markup ein übersichtliches File erstellen. 
Hier das [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#code) dazu.

