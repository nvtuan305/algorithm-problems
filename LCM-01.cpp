#include <iostream>
#include <math.h>

using namespace std;

int GCD(int a, int b) {
    int temp;
    while(b != 0) {
        temp = a % b;
        a = b;
        b = temp;
    }

    return a;
}

int LCM(int a, int b) {
    return abs(a * b) / GCD(a, b);
}

void swap(int &a, int &b) {
    if (a < b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

int main() {
    int a, b;
    cin >> a >> b;
    swap(a, b);
    cout << "Least common multiple = " << LCM(a, b);

    return 0;
}