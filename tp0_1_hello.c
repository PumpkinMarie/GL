#include <stdio.h>
int main() {
  #pragma omp parallel num_threads(10)
  {
  printf("Hello\n");
  printf("World\n");
  }
  return 0;
}
