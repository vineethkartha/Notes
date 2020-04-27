#include<iostream>
#include<string>

int add(int num1, int num2) {
  return num1+num2;
}
int main() {
  int (*ptr)(int,int) = add;
  std::cout<<(*ptr)(1,2)<<std::endl;
  std::cout<<ptr(2,3)<<std::endl;
  return 0;
}
