# Methoden überschreiben
## Lernziel



Bei Vererbung das Überschreiben von Methoden einsetzen.

## Aufgabe

Gehen Sie in das Paket [pr2.vererbung.ueberschreiben_lebewesen](../sources/src/main/java/pr2/vererbung/ueberschreiben_lebewesen/).

Schreiben Sie eine Klasse `Lebewesen`. Diese Klasse soll eine öffentliche Methode `bewegen` haben. Die Methode nimmt keine Parameter und hat keinen Rückgabewert. Die Implementierung in `Lebewesen` soll leer sein.

Schreiben Sie eine Klasse `Amoebe`, die von `Lebewesen` abgeleitet ist, die `bewegen`-Methode überschreibt und in der Methode den Text "Schleimen" ausgibt.

Schreiben Sie eine Klasse `Dackel`, die von `Lebewesen` abgeleitet ist, die `bewegen`-Methode überschreibt und in der Methode den Text "Auf kurzen Beinen vorwärts wackeln" ausgibt. Fügen Sie weiterhin eine Methode `bellen()` zum `Dackel` hinzu, die die Ausgabe "Wau wau wau" erzeugt.

Schreiben Sie einen kleinen Test, bei dem Sie zwei Referenzvariablen (`l1` und `l2`) vom Typ `Lebewesen` erzeugen und dann damit einen neu erzeugten `Dackel` (mit `l1`) und eine neu erzeugte `Amoebe` mit (`l2`) verwalten. Rufen Sie auf beiden die Methode `bewegen` auf. Casten Sie danach die Variable `l1`, die auf den Dackel zeigt, auf einen `Dackel` und rufen Sie die `bellen`-Methode auf, wobei Sie sich vorher mit `instanceof` versichern, dass auch wirklich ein `Dackel` vorliegt.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->