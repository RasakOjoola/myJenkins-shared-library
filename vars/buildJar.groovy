#!/usr/bin/env groovy

def ca ll(){
    echo "building the application..."
    sh 'mvn package'
}
