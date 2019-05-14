#include <stdio.h>

void swap(int *left, int *right) {
    int temp = *left;
    *left = *right;
    *right = temp;
}

void selectionsort(int data[], int n) {
    int beginning;

    for(int i=0; i<n-1; i++) {
        beginning = i;
        for (int j=i+1; j<n; j++) {
            if (data[j] < data[beginning]) {
                beginning = j;
            }
        }
        swap(&data[beginning], &data[i]);
    }
}

int main() {
    int data[] = {1,9,2,8,3,7,4,6,5};
    selectionsort(data, sizeof(data)/sizeof(data[0]));
    for (int i=0; i<sizeof(data)/sizeof(data[0]); i++) {
        printf("%d ", data[i]);
    }
    return 0;
}
