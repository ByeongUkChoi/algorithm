# Definition for a binary tree node.
#
# defmodule TreeNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           left: TreeNode.t() | nil,
#           right: TreeNode.t() | nil
#         }
#   defstruct val: 0, left: nil, right: nil
# end

defmodule Solution do
  @spec tree2str(root :: TreeNode.t() | nil) :: String.t()
  def tree2str(nil) do
    ""
  end

  def tree2str(%{val: val, left: nil, right: nil}) do
    "#{val}"
  end

  def tree2str(%{val: val, left: left, right: nil}) do
    "#{val}(#{tree2str(left)})"
  end

  def tree2str(%{val: val, left: left, right: right}) do
    "#{val}(#{tree2str(left)})(#{tree2str(right)})"
  end
end
