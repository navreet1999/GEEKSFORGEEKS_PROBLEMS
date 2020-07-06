#include <iostream>
using namespace std;

int main() {
	int tests, size, maxIndex, hold;
	cin >> tests;
    for (int i = 0; i<tests; i++){
        maxIndex = -1;
        cin >> size;
        int array[size];
        for (int j = 0; j<size; j++)
            cin >> array[j];
        for (int k = 0; k<size; k++){
            for (int l = size-1; l>=k; l--){
                if (array[k] <= array[l]){
                    hold = l-k;
                    break;
                }
            }
            if (hold > maxIndex){
                maxIndex = hold;
            }
            hold = 0;
        }
        cout << maxIndex << endl;
    }    
	return 0;
}