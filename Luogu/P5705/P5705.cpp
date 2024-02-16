#include <iostream>
#include <iomanip>
#include <math.h>
using namespace std;
double Area(double, double, double);
int main()
{
    double num[3];
    double sum = 0;
    for (int i = 0; i <= 2; i++)
    {
        cin >> num[i];
    }
    double ans = Area(num[0], num[1], num[2]);
    printf("%.1lf", ans);
    return 0;
}

double Area(double a, double b, double c)
{
    double p;
    p = 0.5 * (a + b + c);

    double area = (p * (p - a) * (p - b) * (p - c));
    area = pow(area, 0.5);
    return area;

}