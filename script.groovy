def test() {
    echo "Testing the application..."
    echo "Executing pipeline for branch $BRANCH_NAME"
} 

def build() {
    when {
        expression 
           BRANCH_NAME == 'master' 
        }
            echo "building the application..."
 
} 

def deployApp() {
    when {
        expression 
           BRANCH_NAME == 'master' 
        }
            echo 'deploying the application...'
} 

return this
