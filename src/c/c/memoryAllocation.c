#include <stdio.h>
#include <stdlib.h>
 
int main()
{
    int* ptr;
    ptr = (int*)malloc(1 * sizeof(int));
    if (ptr == NULL) {
        printf("Memory not allocated.\n");
        exit(0);
    }
    else {
        printf("Memory successfully allocated using malloc.\n");
    }

    free(ptr);
    printf("Memory successflly realesed.\n");

    ptr = (int*)calloc(1, sizeof(int));  
    if (ptr == NULL) {
        printf("Memory not allocated.\n");
        exit(0);
    }
    else {
        printf("Memory successfully allocated using calloc.\n");
    }

    free(ptr);
    printf("Memory successflly realesed.\n");
 
    return 0;
}