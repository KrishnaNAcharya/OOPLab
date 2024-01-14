#include <stdio.h>

int main() {
    int n;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    int array[n];

    for (int i = 0; i < n; i++) {
        printf("Enter element %d (0 or 1): ", i + 1);
        scanf("%d", &array[i]);

        // Make sure the input is either 0 or 1
        if (array[i] != 0 && array[i] != 1) {
            printf("Invalid input. Please enter 0 or 1.\n");
            return 1;
        }
    }

    int longestRun = 0;

    for (int i = 0; i < n; i++) {
        if (array[i] == 1) {
            int currentRun = 1;
            while (i + 1 < n && array[i + 1] == 1) {
                currentRun++;
                i++;
            }
            if (currentRun > longestRun) {
                longestRun = currentRun;
            }
        }
    }

    printf("The length of the longest run of 1s is: %d\n", longestRun);

    return 0;
}
