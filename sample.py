from flask import Flask, request

app = Flask(__name__)

@app.route('/data', methods=['POST'])
def handle_data():
    sensor_value = request.form['sensor']
    # Process the received data as needed
    # Here, you can store it in a database, perform calculations, etc.

    # Send a response back if necessary
    return "Data received successfully"

if __name__ == '__main__':
    app.run()
