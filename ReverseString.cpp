#include <iostream>
#include <string>

using namespace std;

int main() {
    string s;
    int n, i, j;

    cin >> s;
    n = s.length();
    i = 0; j = n - 1;

    while (i != j) {
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
        
        i++; j--;
    }

    cout << "Reversed string: " << s;
    return 0;
}