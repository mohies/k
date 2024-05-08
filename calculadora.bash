#!/bin/bash

function suma ()
{       
	resul=`expr $valor1 + $valor2`
	echo "La suma de estos dos numeros es " $resul 
}

function resta
{

	echo "La resta de estos dos numeros es " `expr $valor1 - $valor2`
}

function multiplicacion
{
	echo "La multiplicacion de los dos numeros"`expr $valor1 \* $valor2`
}

function division
{
	if [ $valor2 -eq 0 ] 
	then
		echo " No se puede dividir entre 0"
	else
		echo " La division es" `expr $valor1 / $valor2`
	fi
}


	       	
echo "Introduce el primer valor"
read valor1

until [ $valor1 -lt 24 ] || [ $valor1 -gt 90 ]
do
	echo "Vuelve a introducir el valor1"
	read valor1
done

echo "Introduce segundo valor"
read valor2
while [ $valor2 -eq 0 ]
do
	echo "Introduce el segundo valor nuevamente"
	read valor2
done

opcion2=2
while [ $opcion2 -eq 2 ] 
do	

		
			echo "1. Suma"
			echo "2. Resta"
			echo "3. Multiplicación"
			echo "4. División"
			echo "5. salir"
			echo "6. cambiar valores"
			read opcion

			case $opcion in
				1) suma;;
        			2) resta;;
        			3) multiplicacion;;
       				4) division;;
				5)opcion2=3;;
				6) echo "Introduce nuevo valor1"
					read valor1
				   echo "Introduce nuevo valor"
			   		read valor2	
					;;	
        			*) echo "Opción no válida.";;
			esac
			
			
			
done
echo "Has salido mi hermano"
