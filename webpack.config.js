const path = require('path');

module.exports = {
  entry: path.resolve(__dirname, 'src/js/index.js'),
  mode: 'development',
  output: {
    filename: 'index.bundle.js'
  }
}
