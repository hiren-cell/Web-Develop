const path = require('path')
const webpack = require('webpack')
// TODO: Require the html-webpack-plugin

module.exports = {
    entry: './src/client/index.js',
    devtool: 'source-map',
    module: {
        rules: [
            {
                test: '/\.js$/',
                exclude: /node_modules/,
                loader: "babel-loader"
            }
        ]
    }
    // TODO: Add the plugin for index.html
    // Don't forget your commas!
}
