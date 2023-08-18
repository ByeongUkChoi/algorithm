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
  @spec sum_of_left_leaves(root :: TreeNode.t() | nil) :: integer
  def sum_of_left_leaves(root) do
    get_left_values(root, false)
  end

  defp get_left_values(nil, _) do
    0
  end

  defp get_left_values(%{val: val, left: nil, right: nil}, left?) do
    if left? do
      val
    else
      0
    end
  end

  defp get_left_values(node, _left?) do
    get_left_values(node.left, true) + get_left_values(node.right, false)
  end
end
