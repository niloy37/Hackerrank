//https://www.hackerrank.com/challenges/c-tutorial-strings/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign

#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    string a,b;
    cin>>a>>b;
    int x=a.size();
    int y = b.size();
    cout<<x<<" "<<y<<endl;
    cout<<a+b<<endl;
    int temp;
    temp = a[0];
    a[0]=b[0];
    b[0]=temp;
    cout<<a<<" "<<b<<endl;
  
    return 0;
}

