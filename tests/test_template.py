""" Test the Cookiecutter template.

A template project is created in a temporary directory, it is build in a
self-contained environment, and its test suite is run.

"""
from cookiecutter.generate import generate_context
from cookiecutter.main import cookiecutter
from pathlib import Path
from shlex import split
from subprocess import check_call
from tempfile import TemporaryDirectory


def main() -> int:
    """ Execute the test.
    
    """
    template = Path.cwd()
    context = generate_context()["cookiecutter"]
    with TemporaryDirectory() as tmpdir:
        tmpdir = Path(tmpdir)
        kwargs = {
            "extra_context": {
                "author_name": "Author",
                "compact_dirs": "no",  # test directory expansion
            },
            "no_input": True,
            "output_dir": tmpdir,
        }
        cookiecutter(str(template), **kwargs)
        cwd = tmpdir / context["lib_name"]
        home = tmpdir / "home"
        gradle = f"./gradlew --gradle-user-home={home}/.gradle check"
        check_call(split(gradle), cwd=cwd)
    return 0
    
    
# Make the script executable.

if __name__ == "__main__":
    raise SystemExit(main())
