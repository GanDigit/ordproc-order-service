while sleep 0.1;
  do
    curl "$1/products"
    echo "";
  done ;