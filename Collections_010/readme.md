# `Comparator<T>` verwenden und Objekte sortieren
## Lernziel



Verschiedene Sortierreihenfolgen durch die Implementierung von `Comparator<T>` realisieren.

## Aufgabe

Gehen Sie in das Paket [pr2.collections.sortieren](../sources/src/main/java/pr2/collections/sortieren/).

Sie finden in der Aufgabe bereits die Klasse `Sorter` und den JUnit-Test `SorterTest` vor. Schauen Sie sich die Klasse `Sorter` an und versuchen Sie anhand der JavaDoc und des bereits vorhandenen Codes zu verstehen, was die Klasse machen soll.

Lassen Sie den Test laufen. Sie werden feststellen, dass ein Testfall grün ist, obwohl in `Sorter` gar keine Implementierung vorhanden ist. Versuchen Sie herauszufinden, warum dies so ist.

Fügen Sie nun den fehlenden Code in die Klasse `Sorter` ein, und geben Sie entsprechende `Comparator`-Objekte zurück, sodass die Daten entsprechend dem Parameter `order` sortiert werden können.

Lassen Sie erneut die Tests laufen. Es müssen alle Testfälle grün sein, bevor Sie die Lösung einchecken.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->