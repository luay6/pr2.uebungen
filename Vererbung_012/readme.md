# Vererbung von Figuren
## Lernziel
 [Musterlösung](solution/)


Einfache Klassen schreiben und eine Vererbungshierarchie bilden.

## Aufgabe

Denken Sie bei den folgenden Aufgaben daran, Pakete zu verwenden.

### Figur und Rechteck

Im Paket [pr2.vererbung.vererbung_geometrie](../sources/src/main/java/pr2/vererbung/vererbung_geometrie/) finden Sie Klassen, welche geometrische Figuren repräsentieren.

Die Klasse `Figur` soll als einziges Attribut die Fläche der Figur haben. Bieten Sie weiterhin eine Methode `getFlaeche()` an, mit der die Fläche wieder ausgelesen werden kann. Sorgen Sie dafür, dass nur Subklassen den Konstruktor dieser Klasse aufrufen können. Machen Sie das Attribut `flaeche` private.

Leiten Sie von der Klasse `Figur` eine Klasse `Rechteck` ab. Das Rechteck soll durch Höhe und Breite beschrieben werden und diese Werte sollen benutzt werden, um die Fläche der Figur zu setzen.

### Erweiterung der Figur

Erweitern Sie die Klasse `Figur` so, dass man Objekte ohne Angabe einer Fläche erzeugen kann. Diese Objekte sollen dann die Fläche `0` haben. Die Klasse `Rechteck` soll weiter funktionieren.

### Dreieck

Schreiben Sie eine Klasse `Dreieck`, die von der Klasse `Figur` abgeleitet ist und über Grundseite und Höhe definiert wird.

### Gerade

Schreiben Sie eine Klasse `Gerade`, die von `Figur` abgeleitet ist und als Attribut die Länge der Geraden hat, deren Fläche aber logischerweise `0` ist.

### Quadrat

Schreiben Sie eine Klasse `Quadrat` und leiten Sie diese sinnvoll von den bereits vorhandenen Klassen ab. Überlegen Sie sich, welche Informationen Sie für die Berechnung der Fläche benötigen.

### Tests

Schreiben Sie Unit-Tests, die die von Ihnen entwickelten Klassen testen.

### UML-Diagramm

Zeichnen Sie ein UML-Diagramm von Ihrer Lösung.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->