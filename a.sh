#!/bin/bash


a=0
b=0

for i in {1..100};
do
    output=$(java Coin)
    
    if [[ $output == *"Alex"* ]]; then
        ((a++))
    fi

    if [[ $output == *"Teodor"* ]]; then
        ((b++))
    fi
done


echo "Alex win $a "
echo "Melisa win $b "
