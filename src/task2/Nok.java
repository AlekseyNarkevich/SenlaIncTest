package task2;

class Nok {
    int calcNok(int a, int b) {
        return a / new Nod().calcNod(a, b) * b;
    }
}
