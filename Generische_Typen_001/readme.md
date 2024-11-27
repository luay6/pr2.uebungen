# Einen generischen Typ schreiben
## Lernziel
 [Musterlösung](solution/)


Einen vorhandenen Typ so umgestalten, dass er als generischer Typ verwendet werden kann.

## Aufgabe

Gehen Sie in das Paket [pr2.generics.einfach](../sources/src/main/java/pr2/generics/einfach/).

Sie finden mit `Liste` eine sehr simple Implementierung einer einfach verketteten Liste vor. Zusätzlich gib es auch noch Tests, die die Liste testen.

Führen Sie die Tests aus und überzeugen Sie sich, dass die Liste korrekt funktioniert.

Schreiben Sie die Klasse `Liste` so um, dass sie zu einem generischen Typ wird. Dies bedeutet insbesondere, dass die Methoden `get` und `add` nicht mehr mit `Object` arbeiten, sondern typsicher werden. Sie dürfen in Ihrer Lösung __keine Casts__ verwenden, d.h. Sie müssen sich auch mit der Klasse `ListNode` beschäftigen und hier Änderungen vornehmen.

Führen Sie die Tests erneut aus, um sicherzugehen, dass Sie bei Ihren Änderungen nichts kaputt gemacht haben.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->