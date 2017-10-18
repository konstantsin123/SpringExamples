package varible_vision;

import static varible_vision.A.x;

class C {
    String x = "C.x";

    class D extends B {
        void m() {
            System.out.println(x);
        }
    }
}
