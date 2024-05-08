echo "Introduce el primer número:"
read num1
echo "Introduce el segundo número:"
read num2
echo "Introduce el tercer número:"
read num3

echo "¿Qué quieres hacer con los números, sumar, restar o multiplicar?"
read operacion

if [ "$operacion" = "sumar" ]; then
	resultado=$((num1 + num2 + num3))
    echo "El resultado de sumar es: $resultado"
elif [ "$operacion" = "restar" ]; then
	resultado=$((num1 - num2 - num3))
    echo "El resultado de restar es: $resultado"
elif [ "$operacion" = "multiplicar" ]; then
	resultado=$((num1 * num2 * num3))
    echo "El resultado de multiplicar es: $resultado"
else
    echo "Operación no reconocida."
fi

