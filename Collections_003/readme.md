# `List<T>` und dessen Implementierungen
## Lernziel
 [Musterlösung](solution/)


Das Interface `List<T>` und eine passende Implementierung einsetzen.

## Aufgabe

Gehen Sie in das Paket [pr2.collections.list](../sources/src/main/java/pr2/collections/list/).

Im Projekt finden Sie die Klasse `WordCollector` mit deren Hilfe man die Wörter in einem Text analysieren kann. Nach Übergabe eines Dateinamens wird die Datei eingelesen und die vorhandenen Wörter werden gesammelt. Am Ende wird die Liste der Wörter alphabetisch sortiert ausgegeben.

Leider wurde `WordCollector` von einem Entwickler geschrieben, der nichts von dem Collection-Framework wusste und daher alles mit Array realisiert hat. Hierdurch sind einige sehr komplexe Konstruktionen entstanden.

Lassen Sie das Programm laufen und betrachten Sie die Ausgabe. Schauen Sie sich die Klasse `WordCollector` an und versuchen Sie die Funktionsweise und die Implementierung genau zu verstehen. Dieser Schritt ist wichtig, um die im Folgenden beschriebenen Änderungen an der Klasse vornehmen zu können, lassen Sie sich also Zeit für diesen Schritt.

Ändern Sie die Klasse nun so, dass anstatt Arrays `List<T>` und deren Implementierungen verwendet werden. Ändern Sie die Schnittstellen und Parameter der Methoden von `String[]` auf `List<String>`. Modifizieren Sie auch die Implementierung der Methoden und versuchen Sie Arrays wo immer möglich durch Listen zu ersetzen. Schauen Sie sich auch die JavaDoc der Klassen `java.util.Arrays` und `java.util.Collections` an, um möglicherweise sehr hilfreiche Methoden zu finden.

__Hinweis:__ Die Konstruktion `String[] words = line.toLowerCase().split("[,. ]");` können Sie nicht durch Listen ersetzen, da die `split`-Methode Arrays verwendet.

Die Datei mit dem Text finden Sie unter [kafka.txt](../sources/src/main/resources/pr2/collections/list/kafka.txt).


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->