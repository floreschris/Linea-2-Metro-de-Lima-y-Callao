function eliminar(id) {
	Swal.fire({
		title: "Está seguro de Eliminar?",
		text: "No podrás revertir esta operación!",
		icon: "warning",
		showCancelButton: true,
		confirmButtonColor: "#3085d6",
		cancelButtonColor: "#d33",
		confirmButtonText: "Eliminar"
	}).then((result) => {
		if (result.isConfirmed) {
			$.ajax({
				url: "/eliminar/" + id,

				success: function(res) {
					console.log(res);
				}
			}),
				Swal.fire(
					'Eliminado',
					'El registro ha sido eliminado...',
					'success',
				).then((ok) => {
					if (ok) {
						location.href = "/admin"
					}
				})
		}
	})
}
