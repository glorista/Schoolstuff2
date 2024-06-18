package Programmieren1.Probepruefung.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H'},
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0'},
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},

    };

    public void print() {
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType) {
        int anzahlL = 0;
        int anzahlH = 0;
        if (enemyType == 'L' || enemyType == 'H') {
            for (char[] e1 : environment) {
                for (char e2 : e1) {
                    if (e2 == 'L') {
                        anzahlL++;
                    } else if (e2 == 'H') {
                        anzahlH++;
                    }
                }
            }

        } else {
            System.out.println("Falsche Eingabe");
        }
        if (enemyType == 'L') {
            return anzahlL;
        } else if (enemyType == 'H') {
            return anzahlH;
        } else {
            return -1;
        }
    }

    public int[] countObstaclesPerRow(int row) {
        int[] perRow = new int[2];
        int anzahlHperRow = 0;
        int anzahlLperRow = 0;
        if (row < environment.length) {
            for (int j = 0; j < environment[row].length; j++) {
                if ('H' == environment[row][j]) {
                    ++perRow[0];
                } else if ('L' == environment[row][j]) {
                    ++perRow[1];
                }
            }

        }
        System.out.println("length" + environment[row].length);
        return perRow;

    }


    public int energyNeededInRow(int row) {
        int punkte = 0;
        for (int j = 0; j < environment[row].length; j++) {
            if (environment[row][j] == 'H') {
                punkte = punkte + 2;
            } else if (environment[row][j] == 'L') {
                return -1;
            }
        }
        return punkte;
    }


    public int ableToFinishHiking(int points) {
        int counter=0;
        for (int i = 0; i < environment.length; i++) {
            int ergebnis= energyNeededInRow(i);
            if(ergebnis != -1 && ergebnis<=points){
                ++counter;
            }
        }
        System.out.println("Wie viele Rows kann der Hase mit dem Energielevel "+points+" erfolgreich hin und herhoppeln:");
        return counter;
    }
}
