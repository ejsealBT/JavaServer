<html>
<head>
	<link rel="stylesheet" type="text/css" href="swagger-ui/dist/swagger-ui.css">
</head>

<body>
<h2>Skiddly Diddly</h2>
<div id="swagger-ui"></div>

<script src="swagger-ui-bundle.js"></script>
<script src="swagger-ui/dist/swagger-ui-standalone-preset.js"></script>

<script>
window.onload = function() {
  const ui = SwaggerUIBundle({
    url: "https://yourserver.com/path/to/swagger.json",
    dom_id: '#swagger-ui',
    presets: [
      SwaggerUIBundle.presets.apis,
      SwaggerUIStandalonePreset
    ]
  })

  window.ui = ui
}
</script>

</body>
</html>
