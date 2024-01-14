
#include <stdio.h>

int main() {
    int a = 434;
    int *p = &a;

    // Print the value of 'a'
    printf("Value of a: %d\n", a);

    // Print the address of 'a' (pointer to 'a')
    printf("Address of a: %p\n", (void*)&a);

    // Print the value of the pointer 'p' (which is the address of 'a')
    printf("Value of p (address of a): %p\n", (void*)(p+1));

    // Print the value pointed to by the pointer 'p' (which is 'a')
    printf("Value pointed to by p: %d\n", *(p+1));
    return 0;
}