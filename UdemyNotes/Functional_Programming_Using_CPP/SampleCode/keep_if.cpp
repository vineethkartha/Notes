#include <iostream>
#include <vector>
#include <algorithm>

//template<typename T>
bool is_even(int t) {
  return (t%2) == 0;
}

template<typename F, typename T>
std::vector<T> keep_if(F f, const std::vector<T>& vec) {
  std::vector<T> result;
  for(const auto& num: vec) {
    if(is_even(num))
      result.push_back(num);
  }
  return result;
}
int main() {
  std::vector<int> vec{1,2,3,4};
  std::vector<int> res=keep_if(is_even, vec);
  for(const auto& n: res){
    std::cout<<n<<"\n";
  }
}
