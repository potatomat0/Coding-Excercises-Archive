module.exports = env => {
    return {
        mode: env,
        entry: './index.js',
        output: {
            filename: 'bundle.js',
        },
        module: {
            rules: [
                {
                    test: /\.(js|jsx)/,
                    exclude: /node_modules/,
                    use: [
                        {
                            loader: 'babel-loader',
                            options: {cacheDirectory: true},
                        }
                    ]
                }
            ]
        }
    }
}