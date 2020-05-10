package task2;

class Nod {
    int calcNod(int a, int b) {
        return b == 0 ? a : calcNod(b, a % b);
    }
}
