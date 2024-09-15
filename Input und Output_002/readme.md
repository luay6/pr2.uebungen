# DataOutputStream
## Lernziel



Daten mit einem `DataOutputStreams` manuell serialisieren.

## Aufgabe

Gehen Sie in das Paket [pr2.io.datainputoutput_1](../sources/src/main/java/pr2/io/datainputoutput_1/).

Schreiben Sie eine Klasse `DateWriter`, die ein Datum in der Form yyyy-MM-dd (z.B. 1997-08-29) von der Konsole annimmt und als `long`-Wert mithilfe eines `DataOutputStreams` in eine Datei schreibt.

Schreiben Sie eine Klasse `DateReader`, die den `long`-Wert aus der Datei ausliest und wieder in das ursprüngliche Format bringt und auf der Konsole ausgibt.

**Hinweis:** Zur Konvertierung eines Strings in ein Datum und umgekehrt, können Sie die Klasse `SimpleDateFormat` verwenden. Ein `Date`-Objekt lässt sich leicht über die Methode `getTime` in einen `long`-Wert umwandeln. Denken Sie an eine korrekte Behandlung von möglichen Fehlern.

```console
> java DateWriter 1997-08-29
> java DateReader
Das Datum war: 1997-08-29
```

**Zusatzfrage:** Welche besondere Bedeutung hat das hier als Beispiel verwendete Datum?


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->