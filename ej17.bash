echo "Introduce el primer número:"
read num1
echo "Introduce el segundo número:"
read num2
echo "Introduce una palabra (suma):"
read palabra

if [ $palabra =  "suma" ]
then
    resultado=`expr $num1 + $num2`
    echo "La suma de los números es: $resultado"
else
    echo "La palabra introducida no es suma"
fi

