package Inheritance;

class Childclass extends ParentClass {
    int l;
    int b;
    int w;

    Childclass(int l, int b, int w) {
        this.l = l;
        this.b = b;
        this.w = w;
    }

    Childclass() {
        this.l = 1;
        this.b = 2;
        this.w = 3;
    }
}
