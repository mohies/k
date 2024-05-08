#!/bin/bash

echo "Introduce una palabra:"
read palabra

case $palabra in
    "hola")
        echo "Hola ¿cómo estás?"
        echo "El directorio actual es: $(pwd)"
        echo "El listado completo de la carpeta de usuario es:"
        ls ~
        ;;
    *)
        echo "No has escrito 'hola'"
        ;;
esac
