echo "Introduce un número:"
read numero

echo "Introduce un número:"
read numero2


if [ $numero -gt $numero2 ]
then
        echo "El número1 es mayor que el segundo"
else
        if [ $numero -lt $numero2 ]
        then
                echo "El número es menor que el segundo"
        fi
fi

