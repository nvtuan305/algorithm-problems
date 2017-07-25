#include <iostream>

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

int getMax(int a, int b) {
    return a > b ? a : b;
}

void swap(int &a, int &b) {
    if (a == getMax(a, b)) return;
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    int a, b;
    cin >> a >> b;
    swap(a, b);
    cout << "Greatest common divisor = " << GCD(a, b);
    return 1;
}