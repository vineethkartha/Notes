#include <iostream>
#include <string>
#include <cstring>

std::string ToUpper(const std::string &str) {
  std::string uppercase = "";
  for (auto &ch: str){
    uppercase += toupper(ch);
  }
  return uppercase;
}
int main() {
  std::cout<<ToUpper("abc")<<"\n";
  return 0;
}
