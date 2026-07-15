#!/bin/bash

while true; do
    clear
    echo "Mini Search Engine"
    echo "1. Java"
    echo "2. C"
    echo "3. C++"
    echo "4. Exit"
    
    read -p "Enter your choice [1-4]: " choice
    
    case $choice in
        1)
            javac -d bin java/src/*.java
            java -cp bin Main
            ;;
        2)
            echo "C file execution goes here"
            ;;
        3)
            echo "C++ file execution goes here"
            ;;
        4)
            echo "Exiting..."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please select 1-4."
            ;;
    esac
    
    # Pause the loop so the user can read the output
    read -p "Press [Enter] to continue..." temp
done
